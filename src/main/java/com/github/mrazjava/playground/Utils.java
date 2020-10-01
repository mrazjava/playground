package com.github.mrazjava.playground;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

public class Utils {

    /**
     * Writes a sample progress bar to stdout.
     *
     * @param steps to display on progress bar (eg: 10, 100)
     * @param stepDelayMs time to wait between each step
     * @param progress to display for each step
     */
    public static void drawProgressBar(int steps, long stepDelayMs, char progress) {
        for (int x =0 ; x < steps ; x++) {
            String bar = "\r|" + StringUtils.rightPad(StringUtils.repeat(progress, x) + '>', steps, ' ') + "| " + (x+1);
            try {
                System.out.write(bar.getBytes());
                Thread.sleep(stepDelayMs);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
