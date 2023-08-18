package scope

import java.util.logging.Logger

class Also {

    // Problem:  print a message or other side effect without interrupting the flow of your code.
    // Solution Use the `also` function to perform the action.

    val book = createBook()
        .also { println(it) }
        .also { Logger.getAnonymousLogger().info(it.toString()) }

    private fun createBook() {
          // return ;
    }

}