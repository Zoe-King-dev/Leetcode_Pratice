package org.example.arraylist;

/**
 * @Author Haoran_Yang
 * @Date 2025 01 03 11 30
 **/
public class SlidingWindowTemplate {
    // pesudo-code
    void slidingWindow(String s){
        //Use map if record times of diff items
        //Use int if record sum of items
        Object window = null;

        int left = 0, right = 0;
        while (right < s.length()) {
            // c is char step into window
            //char c = s[right];
            //window.add(c);
            //right ++;
            // Update data in wondow

            //debug could output here
            //printf("window:[%d, %d]\n",left, right)

            //while(left < right && window needs shrink) {
                // d is char removed form window
            //    char d = s[left];
            //    window.remove(d);
            //    left ++;
                // Update data in wondow
            //}
        }
    }
}
