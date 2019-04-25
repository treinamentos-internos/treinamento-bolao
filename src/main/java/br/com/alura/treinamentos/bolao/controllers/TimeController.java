package br.com.alura.treinamentos.bolao.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TimeController {

	@GetMapping("/times/form")
	public String form(Model model, NovoTimeForm form) {
		return "times/form";
	}
	
	@PostMapping("/times")
	public String salva(Model model, @Valid NovoTimeForm form, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return form(model, form);
		}

		//regra aqui

		return "redirect:/times/form";
	}
}

