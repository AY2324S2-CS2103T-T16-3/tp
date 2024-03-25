package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_NO_ARGUMENTS_COMMAND;

import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new ListCommand object
 */
public class ListCommandParser implements Parser<ListCommand> {

    /**
     * Parses any potential {@code String} of text in the context of the ListCommand that should not be there,
     * and returns an AddCommand object for execution.
     * @throws ParseException if the user input has any text after the command word
     */
    public ListCommand parse(String args) throws ParseException {
        if (args.isEmpty() || args.isBlank()) {
            return new ListCommand();
        }
        throw new ParseException(MESSAGE_INVALID_NO_ARGUMENTS_COMMAND);
    }

}
