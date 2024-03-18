

# CivariablesUpdateInstanceVariableRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | The value of a variable |  [optional] |
|**_protected** | **Boolean** | Whether the variable is protected |  [optional] |
|**masked** | **Boolean** | Whether the variable is masked |  [optional] |
|**raw** | **Boolean** | Whether the variable will be expanded |  [optional] |
|**variableType** | [**VariableTypeEnum**](#VariableTypeEnum) | The type of a variable. Available types are: env_var (default) and file |  [optional] |



## Enum: VariableTypeEnum

| Name | Value |
|---- | -----|
| ENV_VAR | &quot;env_var&quot; |
| FILE | &quot;file&quot; |



