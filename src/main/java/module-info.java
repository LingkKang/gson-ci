module test {
    opens com.example.rand;
    requires com.google.gson;
    opens com.example.rand.Model to com.google.gson;
}
