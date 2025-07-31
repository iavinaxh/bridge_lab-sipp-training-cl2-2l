import java.util.*;

interface NavigationManager {
    void visitPage(String url);
    void back();
    void forward();
    void currentPage();
}

class BrowserNavigation implements NavigationManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String current = null;

    public void visitPage(String url) {
        if (current != null) backStack.push(current);
        current = url;
        forwardStack.clear();
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
        }
    }

    public void currentPage() {
        if (current != null) {
            System.out.println("Current: " + current);
        } else {
            System.out.println("No page open.");
        }
    }

    public String getCurrent() {
        return current;
    }
}

class TabbedBrowser {
    private Map<Integer, BrowserNavigation> tabs = new HashMap<>();
    private int currentTabId = -1;
    private int tabCounter = 0;

    public void openTab() {
        tabCounter++;
        tabs.put(tabCounter, new BrowserNavigation());
        currentTabId = tabCounter;
        System.out.println("Opened new tab: Tab " + currentTabId);
    }

    public void closeTab(int tabId) {
        if (tabs.containsKey(tabId)) {
            tabs.remove(tabId);
            System.out.println("Closed Tab " + tabId);
            if (tabId == currentTabId) {
                currentTabId = tabs.isEmpty() ? -1 : tabs.keySet().iterator().next();
            }
        } else {
            System.out.println("Tab does not exist.");
        }
    }

    public void switchToTab(int tabId) {
        if (tabs.containsKey(tabId)) {
            currentTabId = tabId;
            System.out.println("Switched to Tab " + tabId);
        } else {
            System.out.println("Tab does not exist.");
        }
    }

    public void visitPage(String url) {
        if (currentTabId != -1) {
            tabs.get(currentTabId).visitPage(url);
            System.out.println("Visited " + url + " in Tab " + currentTabId);
        } else {
            System.out.println("No tab is currently open.");
        }
    }

    public void back() {
        if (currentTabId != -1) {
            tabs.get(currentTabId).back();
        }
    }

    public void forward() {
        if (currentTabId != -1) {
            tabs.get(currentTabId).forward();
        }
    }

    public void currentPage() {
        if (currentTabId != -1) {
            System.out.print("Tab " + currentTabId + ": ");
            tabs.get(currentTabId).currentPage();
        } else {
            System.out.println("No tab is active.");
        }
    }

    public void listTabs() {
        System.out.println("Open Tabs:");
        for (Map.Entry<Integer, BrowserNavigation> entry : tabs.entrySet()) {
            String page = entry.getValue().getCurrent();
            System.out.println("Tab " + entry.getKey() + ": " + (page != null ? page : "Empty"));
        }
    }
}

public class TabbedBrowserApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TabbedBrowser browser = new TabbedBrowser();

        while (true) {
            System.out.println("\n1. Open Tab\n2. Close Tab\n3. Switch Tab\n4. Visit Page\n5. Back\n6. Forward\n7. Current Page\n8. List Tabs\n9. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    browser.openTab();
                    break;
                case 2:
                    System.out.print("Enter tab ID to close: ");
                    int closeId = sc.nextInt();
                    sc.nextLine();
                    browser.closeTab(closeId);
                    break;
                case 3:
                    System.out.print("Enter tab ID to switch to: ");
                    int switchId = sc.nextInt();
                    sc.nextLine();
                    browser.switchToTab(switchId);
                    break;
                case 4:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visitPage(url);
                    break;
                case 5:
                    browser.back();
                    break;
                case 6:
                    browser.forward();
                    break;
                case 7:
                    browser.currentPage();
                    break;
                case 8:
                    browser.listTabs();
                    break;
                case 9:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
