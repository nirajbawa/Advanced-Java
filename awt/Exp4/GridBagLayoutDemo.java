package awt.Exp4;

import java.awt.*;

public class GridBagLayoutDemo extends Frame {
    GridBagLayoutDemo()
    {
        setVisible(true);
        setSize(500, 500);
        GridBagLayout lay = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(lay);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Button("Button One"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new Button("Button Two"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.ipadx = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Button("Button Three"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new Button("Button Four"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(new Button("Button Five"), gbc);

    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
