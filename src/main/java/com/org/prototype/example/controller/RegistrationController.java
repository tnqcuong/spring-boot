//package com.org.prototype.example.controller;
//
//import com.org.prototype.example.common.GenericResponse;
//import com.org.prototype.example.dto.UserDto;
//import com.org.prototype.example.service.IUserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping("/api")
//public class RegistrationController {
//    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
//
//    @Autowired
//    private IUserService userService;
//
//    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
//    @ResponseBody
//    public GenericResponse registerUserAccount(@Valid @RequestBody final UserDto accountDto, final HttpServletRequest request) {
////        LOGGER.info("Registering user account with information: {}", accountDto);
////        User registered = userService.registerNewUserAccount(accountDto);
////        return new GenericResponse("success");
//    }
//
//    @RequestMapping(value = "/user/registration", method = RequestMethod.GET)
//    public GenericResponse getAllMember() throws Exception {
//        return new GenericResponse("success");
//    }
//}
