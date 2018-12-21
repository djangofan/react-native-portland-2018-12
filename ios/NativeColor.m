//
//  NativeColor.m
//  RNP201812
//
//  Created by Jamon Holmgren on 12/20/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#import "NativeColor.h"

@implementation NativeColor
RCT_EXPORT_MODULE();

RCT_REMAP_METHOD(bgColor,
                 bgColorWithResolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
  resolve(@"#004400");
}
@end
