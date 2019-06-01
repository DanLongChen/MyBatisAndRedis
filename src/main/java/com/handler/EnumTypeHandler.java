package com.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Paser on 2019/3/5.
 */
public class EnumTypeHandler<Enum_Sex> extends BaseTypeHandler<Enum_Sex> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Enum_Sex enum_sex, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            preparedStatement.setString(i, enum_sex.toString());
        } else {
            preparedStatement.setObject(i, enum_sex.toString(), jdbcType.TYPE_CODE);
        }

    }

    @Override
    public Enum_Sex getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Enum_Sex getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Enum_Sex getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
