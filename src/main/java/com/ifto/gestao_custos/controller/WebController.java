package com.ifto.gestao_custos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import com.ifto.gestao_custos.model.Usuario;
import com.ifto.gestao_custos.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    private final UsuarioRepository usuarioRepository;

    public WebController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
        
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastroPage() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String realizarCadastro(@RequestParam String email, @RequestParam String senha, Model model) {
        if (usuarioRepository.findByEmail(email).isPresent()) {
            model.addAttribute("erro", "O e-mail informado já está cadastrado!");
            return "cadastro";
        }

        Usuario novoUsuario = new Usuario();
        usuarioRepository.save(novoUsuario);

        return "redirect:/login?cadastrado=true";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("email");
        return "home";
    }
}
