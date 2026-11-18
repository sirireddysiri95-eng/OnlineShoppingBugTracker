@echo off
title Online Shopping Bug Tracker
cd /d "%~dp0"
echo ========================================================
echo        ONLINE SHOPPING BUG TRACKING SYSTEM
echo ========================================================
echo.

where java >nul 2>nul
if %ERRORLEVEL% EQU 0 (
    echo Found system Java. Launching application...
    java -jar target\OnlineShoppingBugTracker-1.0.jar
) else (
    echo System Java not in PATH. Using bundled JDK 17...
    "C:\Program Files\Android\Android Studio\jbr\bin\java.exe" -jar target\OnlineShoppingBugTracker-1.0.jar
)

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo If the GUI does not appear, you can run in CLI mode:
    "C:\Program Files\Android\Android Studio\jbr\bin\java.exe" -jar target\OnlineShoppingBugTracker-1.0.jar --cli
    pause
)
