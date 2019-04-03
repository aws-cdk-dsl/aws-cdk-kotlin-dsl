## aws-cdk-kotlin-dsl lambda example

This package demonstrates basic usage of kotlin dsl for building aws stack with CloudFormation.

### Quick steps
1. Make sure `aws-cdk` cli is installed, see [cdk](https://github.com/awslabs/aws-cdk) documentation for advanced setup.
    ```bash
    $ npm i -g aws-cdk
    ```
2. Clone this example code to local.
3. Run the following command to deploy the stack
    ```bash
    $ cdk list
    => myStackId
    ```
    ```bash
    $ cdk deploy
    => (confirm the IMA change, and enter "y" to deploy)
    Do you wish to deploy these changes (y/n)? y
    myStackId: deploying...
    myStackId: creating CloudFormation changeset...
     0/4 | 20:19:12 | CREATE_IN_PROGRESS   | AWS::CDK::Metadata    | CDKMetadata 
     0/4 | 20:19:13 | CREATE_IN_PROGRESS   | AWS::IAM::Role        | myFunctionId/ServiceRole (myFunctionIdServiceRole0A0112C8) 
     0/4 | 20:19:14 | CREATE_IN_PROGRESS   | AWS::IAM::Role        | myFunctionId/ServiceRole (myFunctionIdServiceRole0A0112C8) Resource creation Initiated
     0/4 | 20:19:15 | CREATE_IN_PROGRESS   | AWS::CDK::Metadata    | CDKMetadata Resource creation Initiated
     1/4 | 20:19:16 | CREATE_COMPLETE      | AWS::CDK::Metadata    | CDKMetadata 
     2/4 | 20:19:26 | CREATE_COMPLETE      | AWS::IAM::Role        | myFunctionId/ServiceRole (myFunctionIdServiceRole0A0112C8) 
     2/4 | 20:19:29 | CREATE_IN_PROGRESS   | AWS::Lambda::Function | myFunctionId (myFunctionIdF5162FFE) 
     2/4 | 20:19:30 | CREATE_IN_PROGRESS   | AWS::Lambda::Function | myFunctionId (myFunctionIdF5162FFE) Resource creation Initiated
     3/4 | 20:19:31 | CREATE_COMPLETE      | AWS::Lambda::Function | myFunctionId (myFunctionIdF5162FFE) 
    
     ✅  myStackId
    
    ```
    Done! Login to [AWS Console](https://console.aws.amazon.com/console/home) to test lambda!
4. Dive deeper? Modify `src/main/kotlin/software/amazon/awscdk/dsl/examples/App.kt`, change `"Hello, World!"` to `"Hello, AWS CDK Kotlin DSL!"`, run
    ```bash
    $ cdk diff
    =>
    Stack myStackId
    Resources
    [~] AWS::Lambda::Function myFunctionId myFunctionIdF5162FFE 
     └─ [~] Code
         └─ [~] .ZipFile:
             ├─ [-] exports.handler = function(event, context, callback) {
        callback(null, "Hello, World!");
    }
             └─ [+] exports.handler = function(event, context, callback) {
        callback(null, "Hello, AWS CDK Kotlin DSL!");
    }
    ``` 
    Now it works as expected!
    
### Next Step
- Go over [aws cdk reference](https://awslabs.github.io/aws-cdk/reference.html) for detailed API of CDK.
