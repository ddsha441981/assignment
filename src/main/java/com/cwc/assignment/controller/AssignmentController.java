package com.cwc.assignment.controller;

import com.cwc.assignment.service.AssignmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Sofil Ansari
 */
//@RestController
@Controller
//@RequestMapping(" /api/configurations")
@RequiredArgsConstructor
@Slf4j
public class AssignmentController {


    @Autowired
    private final AssignmentService assignmentService;

//    @GetMapping("/{id}")
//    public String[][] getConfiguration(@PathVariable("id") String id) {
//       log.info("getConfiguration called with id: {}" +id);
//        return assignmentService.getConfigurationById(id);
//    }


    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/api/configurations/{id}")
    public String getConfiguration(@RequestParam("id") String id, Model model) {
        log.info("getConfiguration called with id: {}" + id);
        String[][] configuration = assignmentService.getConfigurationById(id);
        model.addAttribute("configuration", configuration);
        return "index";
    }

    @PostMapping("/api/{id}")
    public String updateRemark(@RequestParam("id") String id, @RequestBody String remark, Model model) {
        //String remark = request.get("remark");
        log.info("updateRemark called with id: {} and remark: {}", id, remark);
        assignmentService.updateRemark(id, remark);

        model.addAttribute("message", "success");
        return "index";
    }






//    @PutMapping("/api/configurations/{id}")
//    public ResponseEntity<?> updateRemark(@RequestParam String id, @RequestBody Map<String, String> request) {
//        String remark = request.get("remark");
//        log.info("updateRemark called with id: {} and remark: {}" +id, remark);
//        assignmentService.updateRemark(id, remark);
//        return ResponseEntity.ok(Map.of("message", "success"));
//    }
}
