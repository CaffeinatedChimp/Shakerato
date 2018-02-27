package caffeinated.chimp.console.view;

/**
 * The interface that judges if a certain user input is valid. See the generic user input wrapper method {@link caffeinated.chimp.console.view.AbstractView#prompt(String, Class, Validator) prompt()}
 * @param <T> The class of expected user input
 */

public interface Validator<T> {

    boolean isValid(T t);

}
