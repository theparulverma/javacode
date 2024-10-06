/*package Webcrawler;
import java.io.BufferedReader; import
        java.io.IOException; import
        java.io.InputStreamReader; import
        java.net.MalformedURLException; import
        java.net.URL; import
        java.util.ArrayList; import
        java.util.LinkedList; import
        java.util.List; import
        java.util.Queue; import
        java.util.regex.Matcher; import
        java.util.regex.Pattern;
public class WebCrawler {
    // Queue to store URLs to be crawled
    private Queue<String> queue;
    // List to store discovered websites
    private List<String> discoveredWebsitesList;
    // Constructor initializing the queue and list
    public WebCrawler() { this.queue = new
            LinkedList<>(); this.discoveredWebsitesList =
            new ArrayList<>();
    }
    // Method to start web crawling from a given root URL
    public void discoverWeb(String root) {
        // Add the root URL to the queue and the list of discovered
         this.queue.add(root);
        this.discoveredWebsitesList.add(root);
        // Continue crawling while there are URLs in the queue
        while (!queue.isEmpty()) {
            // Get the next URL from the queue
            String v = this.queue.remove();
            // Fetch the HTML content of the URL
            String rawHtml = readURL(v);
            // Define a regular expression to find URLs in the HTML

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);
            // Iterate through the matched URLs
            while (matcher.find()) {
                // Get the actual URL from the match
                String actualUrl = matcher.group();
                // Check if the URL has not been discovered yet
                if (!discoveredWebsitesList.contains(actualUrl)) { //
                   // Add the URL to the list of discovered websites
                    discoveredWebsitesList.add(actualUrl);
                    // Print the discovered URL
                    System.out.println("Website has been found with URL: "
                            + actualUrl);
                    // Add the URL to the queue for further crawling
                    queue.add(actualUrl);
                }
            }
        }
    }
    // Method to read the HTML content of a given URL
    private String readURL(String v) {
        // Initialize the raw HTML content
        String rawHtml = " ";
        try {
            // Create a URL object from the given string
            URL url = new URL(v);
            // Open a connection to the URL and create a BufferedReader to
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(url.openStream()));
            // Variable to store each line of the HTML content
            String inputLine;
            // Read each line of the HTML content and append it to the
            //rawHtml string while ((inputLine = in.readLine()) != null)
            { rawHtml += inputLine;
            }
            // Close the BufferedReader
            in.close();
        } catch (Exception e) {
            // Print any exceptions that occur during the URL reading
            e.printStackTrace();
        }
        // Return the raw HTML content
        return rawHtml;
    }
    // Placeholder method for any additional crawling logic
    public void crawler(String rootUrl) {
        // Add any additional crawling logic here
    }
}*/
