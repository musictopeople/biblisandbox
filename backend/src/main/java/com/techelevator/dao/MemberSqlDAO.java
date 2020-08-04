package com.techelevator.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberSqlDAO implements MemberDAO{

    private JdbcTemplate jdbcTemplate;

    public MemberSqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean addMember(String firstName, String lastName) {
        boolean memberCreated = false;
        String sql = "INSERT INTO family_members (member,parent,time_reading,family_id) VALUES (?,?,?,?)";

        try {
            int count = jdbcTemplate.update(sql); //removed role
            memberCreated = (count == 1);
        } catch (DataAccessException e) {
            //userCreated remains false
        }
        return memberCreated;
    }
}
