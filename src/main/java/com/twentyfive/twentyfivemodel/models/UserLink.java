package com.twentyfive.twentyfivemodel.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class UserLink {
    private String id;
    private String userId;
    private List<LinkTree> linkTrees;
}
