package baseball.view;

import baseball.util.Util;
import baseball.util.Validator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static int readBaseballSize(int min) {
        System.out.println(InputPhrase.BASEBALL_SIZE);
        return Validator.baseballSize(Util.stringToInteger(readLine()), min);
    }
}