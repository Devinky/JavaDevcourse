package org.study.exception;

import java.io.IOException;
import java.sql.SQLException;

public interface SqlCommend {
	//추상메서드
	void excuteQueryCommend() throws IOException, SQLException, ClassNotFoundException;

}
