package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_NO_ARGUMENTS_COMMAND;

import seedu.address.logic.commands.ShowFavouriteCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new ShowFavouriteCommand object
 */
public class ShowFavouriteCommandParser implements Parser<ShowFavouriteCommand> {

    /**
     * Parses any potential {@code String} of text in the context of the ShowFavouriteCommand that should not be there,
     * and returns an AddCommand object for execution.
     * @throws ParseException if the user input has any text after the command word
     */
    public ShowFavouriteCommand parse(String args) throws ParseException {
        if (args.isEmpty() || args.isBlank()) {
            return new ShowFavouriteCommand();
        }
        throw new ParseException(MESSAGE_INVALID_NO_ARGUMENTS_COMMAND);
    }

}
