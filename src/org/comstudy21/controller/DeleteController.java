package org.comstudy21.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import org.comstudy21.model.Member;

public class DeleteController implements Controller {

	@Override
	public void service() {
		String searchname = nameField.getText();
		if (searchname.equals("")) {
			JOptionPane.showMessageDialog(null, "입력값이 없습니다!");
			return;
		}
		Member dto = new Member(0, searchname, null, null);
		dao.delete(dto);

	}

}
