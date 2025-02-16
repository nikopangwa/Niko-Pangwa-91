import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldHTML {
    public static void main(String[] args) {
        String htmlContent = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Hello World</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background-color: #f0f0f0;
                    }
                    h1 {
                        color: #333;
                        padding: 20px;
                        background-color: #fff;
                        border-radius: 10px;
                        box-shadow: 0 0 10px rgba(0,0,0,0.1);
                    }
                </style>
            </head>
            <body>
                <h1>Hello, World!</h1>
            </body>
            </html>
        """;

        try (FileWriter writer = new FileWriter("hello_world.html")) {
            writer.write(htmlContent);
            System.out.println("HTML file has been created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}