package validation;

import java.text.MessageFormat;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Bean bean = new Bean("a");

        Set<ConstraintViolation<Bean>> viols = validator.validate(bean);

        for (ConstraintViolation<?> viol : viols) {
            System.out.println(viol.getConstraintDescriptor().getAnnotation());
            System.out.println(viol.getInvalidValue());
            System.out.println(viol.getConstraintDescriptor().getAttributes());
        }

        
        System.out.println(viols);
    }

}
