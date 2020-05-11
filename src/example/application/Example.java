package example.application;

public class Example {

    private final long ordinaryLong;
    private final @ExampleTypeAnnotation long exampleLong;

    // Ctrl-F6 refactor this constructor and see that the annotation is stripped
    public Example(
            final long ordinaryLong,
            final @ExampleTypeAnnotation long exampleLong) {
        this.ordinaryLong = ordinaryLong;
        this.exampleLong = exampleLong;
    }
}
