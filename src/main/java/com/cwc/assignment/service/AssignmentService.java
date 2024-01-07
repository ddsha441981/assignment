package com.cwc.assignment.service;

import com.cwc.assignment.model.Assignment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Sofil Ansari
 */
@Service
@Slf4j
public class AssignmentService {


    public String[][] getConfigurationById(String id) {


           Assignment assignment = Assignment.builder()
                .sym1("sym1")
                .sym2("sym2")
                .sym3("sym3")
                .sym4("sym4")
                .sym6("sym6")
                .sym8("sym8")
                .sym5("sym5")
                .sym1("sym1")
                .sym0("sym0")
                .build();
        if (assignment != null) {
            return new String[][]{
                    {assignment.getSym1(), assignment.getSym2(), assignment.getSym3()},
                    {assignment.getSym4(), assignment.getSym6(), assignment.getSym8()},
                    {assignment.getSym5(), assignment.getSym1(), assignment.getSym0()}
            };
        } else {
            log.info("data not found with id: {}" +id);
           throw new RuntimeException("data not found with id: " + id);

        }
    }

    public String updateRemark(String id, String remark) {
        log.info("updateRemark called with id: {} and remark: {}" +id, remark);
      return remark;
    }


}
