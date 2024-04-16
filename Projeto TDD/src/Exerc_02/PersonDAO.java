package Exerc_02;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	    public List<String> isValidToInclude(Person person) {
	        List<String> errors = new ArrayList<>();

	        if (person.getName() == null || person.getName().isEmpty()) {
	            errors.add("O nome da pessoa não pode ser vazio.");
	        } else {
	            String[] parts = person.getName().split(" ");
	            if (parts.length < 2 || !person.getName().matches("[a-zA-Z ]+")) {
	                errors.add("O nome deve ser composto por ao menos 2 partes e deve ser composto de letras.");
	            }
	        }

	        int age = person.getAge();
	        if (age < 1 || age > 200) {
	            errors.add("A idade deve estar no intervalo [1, 200].");
	        }

	        List<Email> emails = person.getEmails();
	        if (emails.isEmpty()) {
	            errors.add("O objeto Person deve ter pelo menos um objeto da classe Email associado.");
	        }

	        for (Email email : emails) {
	        	String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
	            if (!email.getEmail().matches(emailPattern)) {
	                errors.add("O nome da classe Email deve estar no formato '_____@____._____', sendo que cada parte deve ter ao menos um caractere.");
	                break;
	            }
	        }

	        return errors;
	    }
	
}
