package org.example.letian_data_process;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ReadExcel {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(new File("D:/Haoran/Postgraduate/Out_of_Campus/LetianData2.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            int[] columnIndex = {2, 5, 8};
            int[] realIndex = columnIndex;
            for(int i = 0; i < realIndex.length; i++){
                realIndex[i] = realIndex[i] - 1;
            }
            int groupSize = 4;
            ArrayList<double[]> arrayList = new ArrayList<>();
            ArrayList<Double> allList = new ArrayList<>();
            for(int i : realIndex) {

                for (Row row : sheet) {

                    Cell cell0 = row.getCell(0);
                    if (row.getCell(i) == null) break;
                    Cell celli = row.getCell(i);
                    allList.add( (double) celli.getNumericCellValue() );

                    //arrayList.add(floatArray);
                    //System.out.println(allList);
                }
                System.out.println(allList);

            }


            int n = 0;
            while( n < allList.size()) {
                double[] floatArray = new double[groupSize];
                for (int groupIndex = 0; groupIndex < groupSize; groupIndex++) {
                    floatArray[groupIndex] = allList.get(n);
                    n += 1;
                }
                arrayList.add(floatArray);
            }

            for(int i = 0; i < arrayList.size(); i++){
                int pringIndex  = i + 1;
                //处理单个的四个一组的数据组

                //获取数据组
                double[] unit = arrayList.get(i);

                //计算原平均值
                double sumOri = 0.0d;
                for(double f : unit){
                    sumOri += f;
                }
                double Oriave = sumOri / groupSize;
                //System.out.println("第"+pringIndex+"组的Origional ave is " + Oriave);

                //计算每个数与原均值之差
                double maxDiff = 0.0d;
                double[] diffList = new double[groupSize];
                for(int j = 0; j < groupSize; j++){
                    double abs = Math.abs(unit[j] - Oriave);
                    BigDecimal bd = new BigDecimal(abs);
                    double absFin = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                    diffList[j] = absFin;
                    if(absFin > maxDiff) maxDiff = absFin;
                }

                //记录最大差值项
                int maxIndex = 0;
                int wrongMes = 0;
                int repeteFlag = 0;
                for(int j = 0; j < groupSize; j++){
                    if(diffList[j] == maxDiff && repeteFlag == 0) {
                        maxIndex = j;
                        wrongMes += 1;
                        repeteFlag += 1;
                    }
                }
                if(wrongMes != 1) {
                    System.out.println("在第"+pringIndex+"组中");
                    throw new IllegalArgumentException("记录最大差值项出错");
                }

                //剔除最大差值项
                unit[maxIndex] = 0.0d;

                //计算最后平均值
                double sum = 0.0d;
                for(double f : unit){
                    sum += f;
                }
                double ave = sum / (groupSize - 1);
                BigDecimal bdFinal = new BigDecimal(ave);
                double aveFin = bdFinal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                System.out.println("第"+pringIndex+"组的Final average is " + aveFin);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
