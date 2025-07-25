package com.example.assignmentRest.Restful;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class UserVersionController {

    // URI Versioning
    @GetMapping("/v1/user")
    public UserV1 getUserV1() {
        return new UserV1("Azzam Khan", "azzam@example.com");
    }

    @GetMapping("/v2/user")
    public UserV2 getUserV2() {
        return new UserV2("Azzam Khan", "azzam@example.com", "budaun", "9876543210");
    }


    // Request Parameter Versioning
    @GetMapping(value = "/user", params = "version=1")
    public UserV1 getUserParamV1() {
        return new UserV1("Azzam Khan", "azzam@example.com");
    }

    @GetMapping(value = "/user", params = "version=2")
    public UserV2 getUserParamV2() {
        return new UserV2("Azzam Khan", "azzam@example.com", "Delhi", "9876543210");
    }

    // Header Versioning (Custom Header)
    @GetMapping(value = "/user", headers = "X-API-VERSION=1")
    public UserV1 getUserHeaderV1() {
        return new UserV1("Azzam Khan", "azzam@example.com");
    }

    @GetMapping(value = "/user", headers = "X-API-VERSION=2")
    public UserV2 getUserHeaderV2() {
        return new UserV2("Azzam Khan", "azzam@example.com", "England", "9876543210");
    }

    //Mime-Type
    @GetMapping(value = "/user", produces = "application/vnd.company.app-v1+json")
    public UserV1 getUserProducesV1() {
        return new UserV1("Azzam Khan", "azzam@example.com");
    }

    @GetMapping(value = "/user", produces = "application/vnd.company.app-v2+json")
    public UserV2 getUserProducesV2() {
        return new UserV2("Azzam Khan", "azzam@example.com", "Lucknow", "9876543210");
    }
}