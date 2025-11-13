/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author lab_services_student
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ProductSalesApp2 extends JFrame {

    private JTextArea textArea;
    private JLabel totalLabel, averageLabel, overLimitLabel, underLimitLabel, yearsLabel;
    private final int SALES_LIMIT = 500;
    private int[][] productSales = {
            {300, 250}, // Microphone
            {150, 200}, // Speakers
            {700, 600}  // Mixing Desk
    };
    private String[] products = {"Microphone", "Speakers", "Mixing Desk"};

    //  Fixed constructor syntax
    public ProductSalesApp2() {
        setTitle("Product Sales Application");
        setSize(550, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ----- Menu Bar -----
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");
        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        // ----- Text area -----
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // ----- Panel for labels -----
        JPanel infoPanel = new JPanel(new GridLayout(5, 1));
        totalLabel = new JLabel("Total Sales: ");
        averageLabel = new JLabel("Average Sales: ");
        overLimitLabel = new JLabel("Sales over limit: ");
        underLimitLabel = new JLabel("Sales under limit: ");
        yearsLabel = new JLabel("Years Processed: ");
        infoPanel.add(totalLabel);
        infoPanel.add(averageLabel);
        infoPanel.add(overLimitLabel);
        infoPanel.add(underLimitLabel);
        infoPanel.add(yearsLabel);
        add(infoPanel, BorderLayout.SOUTH);

        // ----- Buttons -----
        JPanel buttonPanel = new JPanel();
        JButton loadButton = new JButton("Load Product Data");
        JButton saveButton = new JButton("Save Product Data");
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        add(buttonPanel, BorderLayout.NORTH);

        // ----- Actions for Buttons and Menu Items -----
        loadButton.addActionListener(e -> loadData());
        saveButton.addActionListener(e -> saveData());
        loadItem.addActionListener(e -> loadData());
        saveItem.addActionListener(e -> saveData());
        clearItem.addActionListener(e -> clearData());
        exitItem.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    // Load data and calculate totals
    private void loadData() {
        textArea.setText("DATA LOG\n\nProduct Sales Data:\n\n");

        int total = 0, over = 0, under = 0, count = 0;
        int yearsProcessed = productSales[0].length;

        for (int i = 0; i < productSales.length; i++) {
            textArea.append(products[i] + " - Year 1: " + productSales[i][0] +
                    ", Year 2: " + productSales[i][1] + "\n");

            for (int sale : productSales[i]) {
                total += sale;
                count++;
                if (sale >= SALES_LIMIT)
                    over++;
                else
                    under++;
            }
        }

        double average = (double) total / count;

        totalLabel.setText("Total Sales: " + total);
        averageLabel.setText("Average Sales: " + (int) average);
        overLimitLabel.setText("Sales over limit: " + over);
        underLimitLabel.setText("Sales under limit: " + under);
        yearsLabel.setText("Years Processed: " + yearsProcessed);
    }

    // Save displayed data to data.txt
    private void saveData() {
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write("DATA LOG\n\n");
            writer.write(totalLabel.getText() + "\n");
            writer.write(averageLabel.getText() + "\n");
            writer.write(overLimitLabel.getText() + "\n");
            writer.write(underLimitLabel.getText() + "\n");
            writer.write(yearsLabel.getText() + "\n");
            JOptionPane.showMessageDialog(this, "Data saved to data.txt successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data!");
        }
    }

    // Clear the text area and reset labels
    private void clearData() {
        textArea.setText("");
        totalLabel.setText("Total Sales: ");
        averageLabel.setText("Average Sales: ");
        overLimitLabel.setText("Sales over limit: ");
        underLimitLabel.setText("Sales under limit: ");
        yearsLabel.setText("Years Processed: ");
    }

    //  Fixed main method reference
    public static void main(String[] args) {
        new ProductSalesApp2();
    }
}

