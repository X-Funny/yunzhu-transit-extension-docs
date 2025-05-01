import { defineUserConfig } from "vuepress";

import theme from "./theme.js";

export default defineUserConfig({
  base: "/",

  locales: {
    "/": {
      lang: "en-US",
      title: "Yunzhu Transit Extension",
      description: "A Minecraft Mod",
    },
    "/zh/": {
      lang: "zh-CN",
      title: "云竹交通",
      description: "一个Minecraft Transit Railway 拓展模组",
    },
  },

  theme,

  // Enable it with pwa
  // shouldPrefetch: false,
});
