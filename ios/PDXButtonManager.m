//
//  PDXButtonManager.m
//  RNP201812
//
//  Created by Jamon Holmgren on 12/20/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#import "PDXButtonManager.h"
#import <React/RCTConvert.h>

@implementation PDXButtonManager

RCT_EXPORT_MODULE()
- (UIButton *) view
{
  self.button = [UIButton new];
  [self.button setTitle: @"React Native Portland" forState: UIControlStateNormal];
  [self.button addTarget:self action:@selector(onTap) forControlEvents:UIControlEventTouchUpInside];
  return self.button;
}

- (void) onTap
{
  [self.button setTitle: @"Tapped button" forState: UIControlStateNormal];
}

RCT_EXPORT_VIEW_PROPERTY(enabled, BOOL)

RCT_CUSTOM_VIEW_PROPERTY(bgcolor, NSString, UIButton)
{
  [self.button setBackgroundColor: [RCTConvert UIColor:json] forState: UIControlStateNormal];
}

@end
