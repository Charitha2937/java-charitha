@RestController
public class SecretController {

    // Read token securely from environment variable
    private String githubToken = System.getenv("GITHUB_TOKEN");

}

