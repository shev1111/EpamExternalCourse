package projects.project1.model.dao.exstractors;


import projects.project1.model.entity.Locomotive;
import projects.project1.model.entity.PassengerWaggon;
import projects.project1.model.entity.enums.ComfortLevel;
import projects.project1.model.entity.enums.Engine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExtractTransport {

    public static List<PassengerWaggon> extractPassengerWaggons(ResultSet rs) throws SQLException {
        List<PassengerWaggon> waggons = new ArrayList<>();
        while (rs.next()) {
            waggons.add(PassengerWaggon.newPassengerWaggon()
                    .transportID(rs.getInt("idtransport"))
                    .weight(rs.getInt("weight"))
                    .wheelDiameter(rs.getInt("wheeldiameter"))
                    .manufactureDate(rs.getDate("manufacturedate").toLocalDate())
                    .name(rs.getString("name"))
                    .color(rs.getString("color"))
                    .comfort(ComfortLevel.valueOf(rs.getString("comfort")))
                    .numberOfSeats(rs.getInt("seats"))
                    .build());
        }
        return waggons;
    }

    public static Locomotive extractLocomotive(ResultSet rs) throws SQLException {
        if(rs.next()) {

            return Locomotive.newLocomotive()
                    .transportID(rs.getInt("idtransport"))
                    .weight(rs.getInt("weight"))
                    .wheelDiameter(rs.getInt("wheeldiameter"))
                    .name(rs.getString("name"))
                    .manufactureDate(rs.getDate("manufacturedate").toLocalDate())
                    .color(rs.getString("color"))
                    .engine(Engine.valueOf(rs.getString("engine")))
                    .speed(rs.getInt("speed"))
                    .build();

        }
        return null;
    }

}
