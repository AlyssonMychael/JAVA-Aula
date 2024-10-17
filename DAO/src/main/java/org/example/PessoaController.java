package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PessoaController {

    @Autowired
    private PessoaDAO pessoaDAO;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/pessoas")
    public String listarPessoas() {
        return "listar.html";
    }

    @GetMapping("/Pessoa/api")
    @ResponseBody
    public List<Pessoa> listarPessoasApi() {
        return pessoaDAO.obterTodasPessoas();
    }

    @GetMapping("/pessoas/nova")
    public String novaPessoa(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "formulario.html";
    }

    @PostMapping("/pessoas/salvar")
    public String salvarPessoa(@ModelAttribute Pessoa pessoa) {
        pessoaDAO.inserirPessoa(pessoa);
        return "redirect:/pessoas";
    }

}
