# interplanetary-resource-management
software to help interplanetary miners



# Explaining how minners binary works

in tab blocks, shoud declare the block the size in milimetters, and coordinates x and y.
inside blocks, has materials analysisk as <percentual rated: material id>

```xml
<blocks block_size=45000 coordinate_x=0.17500032 coordinate_y=0.17500032>
    <scan_result
        offset_deeper=0
    >
        <93:1>
        <7:14>
    </scan_result>
    <scan_result
        offset_deeper=1
    >
        <70:1>
        <28:14>
        <2:21>
    </scan_result>
    <scan_result
        offset_deeper=2
    >
        <44:1>
        <50:14>
        <6:21>
    </scan_result>
</blocks>
```

Above exemple says, in this block has 93% with hydrogen and 7% with Sylica.
The explorer machine sends its as signals. And the receiver will save its in some database.