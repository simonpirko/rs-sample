package by.my.rs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class ApplicationConfig extends Application {
    private Set<Class<?>> classes;

    public ApplicationConfig() {
        HashSet<Class<?>> classe = new HashSet<>();
        classe.add(IndexService.class);
        classes = Collections.unmodifiableSet(classe);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
