package logging;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;

public class CommonLogger
{
    private static final String DATE_FORMAT_NOW = "[dd.MM.yyyy HH:mm:ss]";

    private Logger logger = Logger.getGlobal();

    @NotNull
    private String now()
    {
        final Calendar cal = Calendar.getInstance();
        final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

    protected void write(final @NotNull String line)
    {
        System.out.println(now() + " " + line);
    }

}
