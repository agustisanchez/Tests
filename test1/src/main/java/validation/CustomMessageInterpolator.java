package validation;

import java.util.Locale;

import javax.validation.MessageInterpolator;

public class CustomMessageInterpolator implements MessageInterpolator {

    @Override
    public String interpolate(String messageTemplate, Context context) {
        return interpolate(messageTemplate, context, Locale.getDefault());
    }

    @Override
    public String interpolate(String messageTemplate, Context context, Locale locale) {
        
        return null;
    }

}
