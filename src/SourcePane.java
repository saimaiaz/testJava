import java.awt.*;
import javax.swing.*;



public class SourcePane extends JPanel {
    private JTextField datasourceName;
    private JTextField desciption;
    JComboBox  columnType;

    public SourcePane() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;

        add(new JLabel("Table Name: "), gbc);
        gbc.gridy++;
        add(new JLabel("Column Name: "), gbc);
        gbc.gridy++;
        add(new JLabel("Column Type: "), gbc);
        
        

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        add((datasourceName = new JTextField(10)), gbc);
        gbc.gridy++;
        add((desciption = new JTextField(10)), gbc);
        gbc.gridy++;
        
        String coltype[]={"int","varchar","float","datetime","date"}; 
        add((columnType = new JComboBox(coltype)), gbc);
    }

    public JComboBox getColumnType() {
		return columnType;
	}

	public void setColumnType(JComboBox columnType) {
		this.columnType = columnType;
	}

	public String getDataSourceName() {
        return datasourceName.getText();
    }

    public String getDescription() {
        return desciption.getText();
    }

    public void setDataSourceName(String name) {
        datasourceName.setText(name);
    }

    public void setDescription(String description) {
        desciption.setText(description);
    }

}
