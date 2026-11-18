# Online Shopping Bug Tracker

A professional desktop bug tracking application built with **Java Swing**, **Maven**, and **local JSON persistence** using Object-Oriented Programming (OOP) principles.

Designed for QA engineers and development teams managing defects across an Online Shopping / E-Commerce platform.

---

## 🚀 Key Features

### 1. Executive Dashboard
- **Real-Time KPI Cards**:
  - Total Bugs logged
  - Open Bugs (awaiting triage / fix)
  - In-Progress Bugs (under active investigation)
  - Resolved Bugs (fixed and verified)
- **Visual Distributions**:
  - Defect count and percentage bars by Shopping Module
  - Severity breakdown (Critical, High, Medium, Low)
- **Quick Action Triggers**: Instant navigation to report defects or manage bug records.

### 2. Bug Reporting
- **Automatic Bug ID Generation**: Sequentially generated IDs (e.g. `BUG-1001`, `BUG-1002`, `BUG-1006`).
- **Standardized Shopping Modules**:
  - `Login`
  - `Product Search`
  - `Shopping Cart`
  - `Payment`
  - `Order Tracking`
- **Severity Levels**: `Low`, `Medium`, `High`, `Critical`.
- **Workflow Statuses**: `Open`, `In Progress`, `Resolved`.
- **Robust Field Validation**: Validates minimum title length and non-empty descriptions before submission.

### 3. View & Manage Bugs (Directory)
- **Interactive JTable**: Displays ID, Title, Module, Priority, Status, and Reported Date.
- **Color-Coded Status & Priority Badges**:
  - `Critical` (Crimson Red)
  - `High` (Orange)
  - `Medium` (Sky Blue)
  - `Low` (Slate Gray)
  - `Open` (Red)
  - `In Progress` (Blue)
  - `Resolved` (Emerald Green)
- **Row Double-Click**: Double-clicking any bug opens its detail & edit dialog.

### 4. Update Bugs
- Update Bug Title, Shopping Module, Severity Priority, Workflow Status, and Description.
- Automatically updates `updatedDate` timestamp and persists changes to JSON.

### 5. Delete Bugs
- Permanently remove resolved or invalid bug records with a confirmation dialog.

### 6. Search & Multi-Criteria Filtering
- **Live Search**: Instant keyword search across Bug Title, Bug ID (e.g. `1001` or `BUG-1001`), and Description.
- **Dropdown Filters**: Filter simultaneously by:
  - Shopping Module
  - Priority Level
  - Workflow Status
- **Reset Button**: Single-click restore to full list.

### 7. Bug Analytics & Quality Statistics
- Quality KPI Metrics including **Resolution Rate %** and **Open Ratio %**.
- Progress-bar visualizers for module defect density and priority breakdown.

### 8. JSON Local File Storage
- **Local Persistence**: Stored in human-readable, indented JSON format (`bugs.json`).
- **Auto-Initialization**: Pre-populates realistic starter bugs for testing upon first run.
- **Persistence Guarantee**: All adds, updates, and deletes persist across app sessions.

---

## 📁 Project Architecture

```
OnlineShoppingBugTracker/
├── pom.xml                                      # Maven build configuration
├── run.bat                                      # 1-click Windows runner
├── bugs.json                                    # Local JSON data store
├── target/
│   └── OnlineShoppingBugTracker-1.0.jar         # Standalone executable JAR
└── src/
    ├── main/java/com/bugtracking/
    │   ├── Main.java                            # Entry point & Look & Feel setup
    │   ├── BugReport.java                       # Data model & JSON serialization
    │   ├── BugStorage.java                      # File I/O & JSON persistence
    │   ├── BugManager.java                      # Controller & business logic
    │   └── BugTrackerUI.java                    # Modern Java Swing interface
    └── test/java/com/bugtracking/
        └── BugTrackerTest.java                  # Automated unit test suite
```

---

## 🛠️ Building & Running

### Option 1: Quick Run via `run.bat`
Double-click `run.bat` or run from cmd/PowerShell:
```bat
run.bat
```

### Option 2: Run Executable JAR
```bash
java -jar target/OnlineShoppingBugTracker-1.0.jar
```
Or for CLI summary mode:
```bash
java -jar target/OnlineShoppingBugTracker-1.0.jar --cli
```

### Option 3: Compile & Run with Maven
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.bugtracking.Main"
```

### Option 4: Run Automated Tests
```bash
java -cp "target/classes;target/test-classes;C:\Users\91855\.m2\repository\org\json\json\20250517\json-20250517.jar" com.bugtracking.BugTrackerTest
```
Result: `5 PASSED, 0 FAILED`
