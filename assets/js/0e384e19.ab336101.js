"use strict";(self.webpackChunkdocs=self.webpackChunkdocs||[]).push([[671],{3905:(t,e,n)=>{n.d(e,{Zo:()=>c,kt:()=>k});var a=n(7294);function r(t,e,n){return e in t?Object.defineProperty(t,e,{value:n,enumerable:!0,configurable:!0,writable:!0}):t[e]=n,t}function i(t,e){var n=Object.keys(t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(t);e&&(a=a.filter((function(e){return Object.getOwnPropertyDescriptor(t,e).enumerable}))),n.push.apply(n,a)}return n}function o(t){for(var e=1;e<arguments.length;e++){var n=null!=arguments[e]?arguments[e]:{};e%2?i(Object(n),!0).forEach((function(e){r(t,e,n[e])})):Object.getOwnPropertyDescriptors?Object.defineProperties(t,Object.getOwnPropertyDescriptors(n)):i(Object(n)).forEach((function(e){Object.defineProperty(t,e,Object.getOwnPropertyDescriptor(n,e))}))}return t}function l(t,e){if(null==t)return{};var n,a,r=function(t,e){if(null==t)return{};var n,a,r={},i=Object.keys(t);for(a=0;a<i.length;a++)n=i[a],e.indexOf(n)>=0||(r[n]=t[n]);return r}(t,e);if(Object.getOwnPropertySymbols){var i=Object.getOwnPropertySymbols(t);for(a=0;a<i.length;a++)n=i[a],e.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(t,n)&&(r[n]=t[n])}return r}var m=a.createContext({}),d=function(t){var e=a.useContext(m),n=e;return t&&(n="function"==typeof t?t(e):o(o({},e),t)),n},c=function(t){var e=d(t.components);return a.createElement(m.Provider,{value:e},t.children)},p="mdxType",s={inlineCode:"code",wrapper:function(t){var e=t.children;return a.createElement(a.Fragment,{},e)}},u=a.forwardRef((function(t,e){var n=t.components,r=t.mdxType,i=t.originalType,m=t.parentName,c=l(t,["components","mdxType","originalType","parentName"]),p=d(n),u=r,k=p["".concat(m,".").concat(u)]||p[u]||s[u]||i;return n?a.createElement(k,o(o({ref:e},c),{},{components:n})):a.createElement(k,o({ref:e},c))}));function k(t,e){var n=arguments,r=e&&e.mdxType;if("string"==typeof t||r){var i=n.length,o=new Array(i);o[0]=u;var l={};for(var m in e)hasOwnProperty.call(e,m)&&(l[m]=e[m]);l.originalType=t,l[p]="string"==typeof t?t:r,o[1]=l;for(var d=2;d<i;d++)o[d]=n[d];return a.createElement.apply(null,o)}return a.createElement.apply(null,n)}u.displayName="MDXCreateElement"},9881:(t,e,n)=>{n.r(e),n.d(e,{assets:()=>m,contentTitle:()=>o,default:()=>s,frontMatter:()=>i,metadata:()=>l,toc:()=>d});var a=n(7462),r=(n(7294),n(3905));const i={sidebar_position:1},o="Getting Started",l={unversionedId:"intro",id:"intro",title:"Getting Started",description:"Follow this tutorial to create your first scheduled command.",source:"@site/docs/intro.md",sourceDirName:".",slug:"/intro",permalink:"/CommandTimer/docs/intro",draft:!1,tags:[],version:"current",sidebarPosition:1,frontMatter:{sidebar_position:1},sidebar:"tutorialSidebar",next:{title:"Configuration",permalink:"/CommandTimer/docs/configuration/"}},m={},d=[{value:"Creating a task",id:"creating-a-task",level:2},{value:"Commands",id:"commands",level:2}],c={toc:d},p="wrapper";function s(t){let{components:e,...n}=t;return(0,r.kt)(p,(0,a.Z)({},c,n,{components:e,mdxType:"MDXLayout"}),(0,r.kt)("h1",{id:"getting-started"},"Getting Started"),(0,r.kt)("p",null,"Follow this tutorial to create your first scheduled command."),(0,r.kt)("p",null,"CommandTimer works with tasks. Tasks define a group of commands that follow the same execution schema. An execution\nschema is a collection of settings and conditions that define when certain commands get executed."),(0,r.kt)("h2",{id:"creating-a-task"},"Creating a task"),(0,r.kt)("p",null,"Everything starts with the ",(0,r.kt)("inlineCode",{parentName:"p"},"/cmt")," command. This will open a GUI where everything can be managed from."),(0,r.kt)("p",null,"Clicking the paper will create a fresh task for you."),(0,r.kt)("h2",{id:"commands"},"Commands"),(0,r.kt)("table",null,(0,r.kt)("thead",{parentName:"table"},(0,r.kt)("tr",{parentName:"thead"},(0,r.kt)("th",{parentName:"tr",align:null},"Command"),(0,r.kt)("th",{parentName:"tr",align:null},"Description"),(0,r.kt)("th",{parentName:"tr",align:null},"Permission"))),(0,r.kt)("tbody",{parentName:"table"},(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt")),(0,r.kt)("td",{parentName:"tr",align:null},"Open main CommandTimer menu where everything is managed"),(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.manage"))),(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt help")),(0,r.kt)("td",{parentName:"tr",align:null},"Get a list of all possible commands"),(0,r.kt)("td",{parentName:"tr",align:null},"Any CommandTimer permission")),(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt time")),(0,r.kt)("td",{parentName:"tr",align:null},"Get the current world time the player is in"),(0,r.kt)("td",{parentName:"tr",align:null},"Any CommandTimer permission")),(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt activate <task>")),(0,r.kt)("td",{parentName:"tr",align:null},"Enable the specified task"),(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.activate")," or ",(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.toggle"))),(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt deactivate <task>")),(0,r.kt)("td",{parentName:"tr",align:null},"Disable the specified task"),(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.deactivate"),"  or ",(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.toggle"))),(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt execute <task>")),(0,r.kt)("td",{parentName:"tr",align:null},"Instantly execute the specified task"),(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.execute"))),(0,r.kt)("tr",{parentName:"tbody"},(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"/cmt reload")),(0,r.kt)("td",{parentName:"tr",align:null},"Reload the plugin. Extensions will not be reloaded. ",(0,r.kt)("strong",{parentName:"td"},"It is not recommended to use this command")),(0,r.kt)("td",{parentName:"tr",align:null},(0,r.kt)("inlineCode",{parentName:"td"},"commandtimer.manage"))))))}s.isMDXComponent=!0}}]);