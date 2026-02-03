# RestAPITest Framework
A Java-based automated testing framework for REST APIs, using OkHttpClient and TestNG.

# Project Overview

This is an automated testing framework designed for testing RESTful APIs. Currently focused on the public/get-candlestick endpoint, but the framework is designed to be extensible to other endpoints.

Current Status: Demo phase (basic framework established)

# Design Rationale
To facilitate REST API testing while ensuring future extensibility, we have implemented a robust framework with the following design considerations:
1.	HTTP Client Layer: Utilized OkHttpClient for constructing and sending HTTP requests, chosen for its reliability and comprehensive features.
2.	Testing Framework: Integrated TestNG as the testing framework due to its powerful annotation-based configuration, parallel execution capabilities,and flexible assertion mechanisms that support complex validation scenarios.
3.	Response Processing: Employed the Jackson library for JSON serialization/deserialization, enabling efficient parsing and validation of API responses with minimal boilerplate code.
4.	Test Case Management: Currently using Excel for test case management, providing a user-friendly interface for testers and product owners to define, modify, and maintain test scenarios without code changes.
5.	Test Design Methodology: Test cases are designed based on API documentation using established testing techniques including:
      •	Boundary Value Analysis: Testing at the edges of input domains
      •	Equivalence Partitioning: Grouping similar inputs to reduce test redundancy
      •	Positive/Negative Testing: Validating both expected behaviors and error conditions
      •	Parameter Variation: Systematically testing different parameter combinations
This design provides a solid foundation for automated API testing while maintaining flexibility for future enhancements such as integration with CI/CD pipelines, support for additional data formats, and advanced reporting capabilities.
      
# Key Architectural Decisions:
1. Separation of Concerns: Clear distinction between test logic (Java code) and test data (Excel files)
2. Data-Driven Approach: Enables running the same test logic with multiple datasets
3. Extensible Framework: Modular design allowing easy addition of new API endpoints and test types
4. Maintainability: Structured codebase with consistent patterns and comprehensive documentation
# Prerequisites
- Java 8+
- Maven 3.6+
- Git

# Clone the Project
```bash
git clone git@github.com:littleHuangworkinghard/RestAPITest.git
cd RestAPITest
