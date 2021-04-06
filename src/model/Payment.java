package model;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

public class Payment {

    private int entranceFee;
    private int workerFee;
    private int gamesFee;
    private int restaurantFee;
    private int toiletFee;

    public Payment() {
        this.toiletFee = 5;
        this.restaurantFee = 25;
        this.gamesFee = 30;
        this.workerFee = 15;
        this.entranceFee = 50;
    }

    /**
     * When the player wants to change the fees these functions are called.
     * The setFee functions are almost the same, the difference is the given
     * fee and the text.
     * 
     * @param scale the maximum value which the given fee can be
     */
    public void setEntranceFee(int scale) {
        JFrame parent = new JFrame();

        JOptionPane optionPane = new JOptionPane();
        optionPane.setPreferredSize(new Dimension(310, 150));
        JSlider slider = getSlider(optionPane, scale);
        slider.setValue(entranceFee);
        optionPane.setMessage(new Object[]{"Belépődíj: ", slider});
        JDialog dialog = optionPane.createDialog(parent, "Ár megadása");
        dialog.setVisible(true);
        entranceFee = slider.getValue();
    }

    public void setWorkerFee(int scale) {
        JFrame parent = new JFrame();

        JOptionPane optionPane = new JOptionPane();
        optionPane.setPreferredSize(new Dimension(310, 150));
        JSlider slider = getSlider(optionPane, scale);
        slider.setValue(workerFee);
        optionPane.setMessage(new Object[]{"Dolgozói bérek: ", slider});
        JDialog dialog = optionPane.createDialog(parent, "Ár megadása");
        dialog.setVisible(true);
        workerFee = slider.getValue();
    }

    public void setGamesFee(int scale) {
        JFrame parent = new JFrame();

        JOptionPane optionPane = new JOptionPane();
        optionPane.setPreferredSize(new Dimension(310, 150));
        JSlider slider = getSlider(optionPane, scale);
        slider.setValue(gamesFee);
        optionPane.setMessage(new Object[]{"Játékok ára: ", slider});
        JDialog dialog = optionPane.createDialog(parent, "Ár megadása");
        dialog.setVisible(true);
        gamesFee = slider.getValue();
    }

    public void setRestaurantFee(int scale) {
        JFrame parent = new JFrame();

        JOptionPane optionPane = new JOptionPane();
        optionPane.setPreferredSize(new Dimension(310, 150));
        JSlider slider = getSlider(optionPane, scale);
        slider.setValue(restaurantFee);
        optionPane.setMessage(new Object[]{"Éttermek ára: ", slider});
        JDialog dialog = optionPane.createDialog(parent, "Ár megadása");
        dialog.setVisible(true);
        restaurantFee = slider.getValue();
    }

    public void setToiletFee(int scale) {
        JFrame parent = new JFrame();

        JOptionPane optionPane = new JOptionPane();
        optionPane.setPreferredSize(new Dimension(310, 150));
        JSlider slider = getSlider(optionPane, scale);
        slider.setValue(toiletFee);
        optionPane.setMessage(new Object[]{"Mosdó ára: ", slider});
        JDialog dialog = optionPane.createDialog(parent, "Ár megadása");
        dialog.setVisible(true);
        toiletFee = slider.getValue();
    }

    /**
     * Creates slider for the given optionPane.
     *
     * @param optionPane panel where the slider is shown
     * @param scale the maximum amount of the slider
     */
    static JSlider getSlider(final JOptionPane optionPane, int scale) {
        JSlider slider = new JSlider(0, scale);
        slider.setMajorTickSpacing(10);
        if (scale < 50) {
            slider.setMinorTickSpacing(1);
        } else {
            slider.setMinorTickSpacing(5);
        }
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        return slider;
    }
}
