//
//  PDXButtonManager.m
//  RNP201812
//
//  Created by Jamon Holmgren on 12/20/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#import "PDXButtonManager.h"

@implementation PDXButtonManager

RCT_EXPORT_MODULE()
- (UIView *) view
{
  self.button = [UIButton new];
  [self.button setTitle: @"Jamon" forState: UIControlStateNormal];
  [self.button addTarget:self action:@selector(onTap) forControlEvents:UIControlEventTouchUpInside];
  return self.button;
}

- (void) onTap
{
  [self.button setTitle: @"Tapped" forState: UIControlStateNormal];
}
@end
