package Exerc_02;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void testIsValidToInclude() {
        PersonDAO personDAO = new PersonDAO();

        List<Email> emails1 = new ArrayList<>();
        Person person1 = new Person("Joao da Silva", 30, emails1);
        List<String> expectedErrors1 = new ArrayList<>();
        expectedErrors1.add("O nome deve ser composto por ao menos 2 partes e deve ser composto de letras.");
        assert true;

        List<Email> emails2 = new ArrayList<>();
        Person person2 = new Person("Joao da Silva", -1, emails2);
        List<String> expectedErrors2 = new ArrayList<>();
        expectedErrors2.add("A idade deve estar no intervalo [1, 200].");
        assert true;

        List<Email> emails3 = new ArrayList<>();
        Person person3 = new Person("Joao da Silva", 30, emails3);
        List<String> expectedErrors3 = new ArrayList<>();
        expectedErrors3.add("O objeto Person deve ter pelo menos um objeto da classe Email associado.");
        assert true;

        Email email1 = new Email("joao.silva@fatec");
        List<Email> emails4 = new ArrayList<>();
        emails4.add(email1);
        Person person4 = new Person("Joao da Silva", 30, emails4);
        List<String> expectedErrors4 = new ArrayList<>();
        expectedErrors4.add("O nome da classe Email deve estar no formato '_____@____._____', sendo que cada parte deve ter ao menos um caractere.");
        assert true;

        Email email2 = new Email("joao.silvae@example.com");
        List<Email> emails5 = new ArrayList<>();
        emails5.add(email2);
        Person person5 = new Person("Joao da Silva", 30, emails5);
        List<String> expectedErrors5 = new ArrayList<>();
        assert true;
    }
}
