package com.ireland.travel.management;



import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ireland.travel.entity.domain.Report;
import com.ireland.travel.service.ReportBuilderService;
import com.ireland.travel.service.ReportService;
import com.ireland.travel.service.UploadService;


@Controller
@RequestMapping("/reports")
public class ReportController {
	
	@Autowired
	UploadService upService;
	
	@Autowired
	ReportService reportService;
	
	@Autowired
	ReportBuilderService buildService;
	
	@RequestMapping(params = "upload")
	public String csv(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "report/upload";
	}
	
	@RequestMapping(params = "view")
	public String manageUsers(Model model) {
		model.addAttribute("reports", reportService.findAllReports());
		return "report/view";
	}
	
	@RequestMapping(value = "/go", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("report") @Valid Report report,
			BindingResult result) {
		if (result.hasErrors()) {
			return "reports/upload";
		}
		upService.upload();
		buildService.build(report, upService);
		reportService.saveReport(report);
		return "redirect:/reports?view";
	}
	
}
