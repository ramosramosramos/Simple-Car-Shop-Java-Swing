
package Tools;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JPanel;
import javax.swing.JTable;

public class PrintHelper {

 public static void getPrintPanel(JPanel panel) {
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    printerJob.setPrintable((Graphics graphics, PageFormat pageFormat, int pageIndex) -> {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE; // Only one page
        }
        
        Graphics2D g2d = (Graphics2D) graphics;
        
        // Translate to the printable area
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        
        // Get the dimensions of the panel and the printable area
        double panelWidth = panel.getWidth();
        double panelHeight = panel.getHeight();
        double printableWidth = pageFormat.getImageableWidth();
        double printableHeight = pageFormat.getImageableHeight();
        
        // Calculate the scale factors to fit the panel within the printable area
        double scaleX = printableWidth / panelWidth;
        double scaleY = printableHeight / panelHeight;
        double scale = Math.min(scaleX, scaleY); // Uniform scaling
        
        // Apply the scaling
        g2d.scale(scale, scale);
        
        // Print the panel
        panel.printAll(g2d);
        
        return Printable.PAGE_EXISTS;
    });

    boolean doPrint = printerJob.printDialog(); // Display print dialog
    if (doPrint) {
        try {
            printerJob.print();
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
}


    public static void getPrintTable(JTable table) {
        try {

            table.print(JTable.PrintMode.FIT_WIDTH);
        } catch (PrinterException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
