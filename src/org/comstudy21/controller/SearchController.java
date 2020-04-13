package org.comstudy21.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import org.comstudy21.model.Member;

public class SearchController implements Controller {

	@Override
	public void service() {
		String searchname = nameField.getText();
		if(searchname.equals("")){
			JOptionPane.showMessageDialog(null, "입력값이 없습니다!");
			return;
		}
		Member dto = new Member(0,searchname,null,null);
		
		Vector<Vector> dataList = dao.select(dto);
		
		
		
		if (dataList != null) {
			while (dm.getRowCount() > 0) {
				dm.removeRow(0);
			}

			for (Vector rowData : dataList) {
				dm.addRow(rowData);
			}
		} else{
			JOptionPane.showMessageDialog(null, "해당값이 없습니다!");
		}
	}

}
