package com.example.tests_showcase.controllers;

import com.example.tests_showcase.models.dtos.GetResponseDto;
import com.example.tests_showcase.models.dtos.PostRequestDto;
import com.example.tests_showcase.models.dtos.PostResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    @GetMapping("example")
    public GetResponseDto getExample(){
        return new GetResponseDto("INFO", "MESSAGE");
    }

    @PostMapping("example")
    public PostResponseDto postExample(@RequestBody PostRequestDto postRequestDto){
        return new PostResponseDto("piiiii porrororoo", postRequestDto.message());
    }
}
