package com.cwc.assignment.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



/**
 * @author Deendayal Kumawat
 */
@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Assignment {


        @Id
        private String id;
        private String sym1;
        private String sym2;
        private String sym3;
        private String sym4;
        private String sym6;
        private String sym8;
        private String sym5;
        private String sym0;




}
