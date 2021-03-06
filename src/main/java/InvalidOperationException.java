package main.java;

/**
 * class for matrix positions
 */
import java.lang.*;  // for class Exception

public class InvalidOperationException extends RuntimeException {
    
        /**
         * Constructs a <code>InvalidOperationException</code> 
         * with no detail message.
         */
        public InvalidOperationException() {
                super();
        }

        /**
         * Constructs a <code>DimensionException</code> with the specified 
         * detail message. 
         *
         * @param   s   the detail message.
         */
        public InvalidOperationException(String message) {
                super( message );
        }
}

