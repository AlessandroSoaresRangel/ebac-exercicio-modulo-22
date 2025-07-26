package tests;

import main.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    @Test
    public void isFemininoTest() {
        Pessoa pessoa = new Pessoa("julia", "Feminino");
        Assert.assertTrue(pessoa.isFeminino());
    }

    @Test
    public void isNotFemininoTest() {
        Pessoa pessoa = new Pessoa("Alessandro", "Masculino");
        Assert.assertFalse(pessoa.isFeminino());
    }
}
